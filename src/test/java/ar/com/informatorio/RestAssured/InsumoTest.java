package ar.com.informatorio.RestAssured;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;


import org.testng.annotations.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class InsumoTest {
	private Insumo insumo= new Insumo(8,"cartucho color HP4040",20); 
	
	@BeforeMethod
	public void inicialize() {
		RestAssured.baseURI= "http://localhost";
		RestAssured.port= 3000;
		RestAssured.basePath="/api/insumo";
		
  }
	
	@Test
	 public void getAllSupplies() {
		Response response = RestAssured.given().log().all().get(); 
		response.prettyPrint();
		assertEquals(response.statusCode(), 200);
		
		JsonPath json= response.jsonPath();
		assertFalse(json.getList("insumos").isEmpty(), "La lista de insumos está vacía");
		//validamos el segundo insumo
		assertEquals(json.getInt("insumos[0].id"), 1);
		assertEquals(json.getString("insumos[0].nombre"), "tinta 952");
		assertEquals(json.getInt("insumos[0].cantidad"), 6);
	  }
	
	@Test
	  public void getSuppliesByIdUsingPathParam() {
		Response response = RestAssured.given().log().all().pathParam("supplyId", "3").get("/{supplyId}");
		response.prettyPrint();
		 assertEquals(response.statusCode(), 200, "Insumo inexistente");
		
				
	  }
	
	@Test
	  public void getSupplies2ByIdUsingPathParam() {
		//como el tercer insumo es inexistente se obtiene el segundo
		Response response = RestAssured.given().log().all().pathParam("supplyId", "2").get("/{supplyId}");
		response.prettyPrint();
		 assertEquals(response.statusCode(), 200);
		 JsonPath json = response.jsonPath();
		 assertEquals(json.getInt("id"),2);
		 assertEquals(json.getString("nombre"),"papel A4");
		 assertEquals(json.getInt("cantidad"),5);
				
	  }
	
	@Test
	public void addSupply() {
		
		Response response = RestAssured.given().log().all()
				.contentType(ContentType.JSON).body(insumo).post();
		response.prettyPrint();
		assertEquals(response.statusCode(), 201);
		JsonPath json = response.jsonPath();
		assertEquals(json.getString("mensaje"),"El insumo se ha agregado");
	}
	
	@Test(dependsOnMethods = "addSupply")
	public void getByIdUsingQueryParam() {
		Response response = RestAssured.given().log().all()
				.queryParam("id",insumo.getId()).get();
		response.prettyPrint();
		assertEquals(response.statusCode(), 200);
		JsonPath json = response.jsonPath();
		assertEquals(json.getInt("id"), insumo.getId());
		assertEquals(json.getString("nombre"), insumo.getNombre());
		assertEquals(json.getInt("cantidad"), insumo.getCantidad());
		
	}
	
	@Test(dependsOnMethods = "getByIdUsingQueryParam")
	public void deleteSupply(){
		Response response = RestAssured.given().log().all()
				.pathParam("id", insumo.getId())
				.delete("/{id}");
		response.prettyPrint();
		assertEquals(response.statusCode(), 200);
		JsonPath json = response.jsonPath();
		assertEquals(json.getString("message"), "El insumo ha sido eliminado exitosamente.");
	}
		
 }
