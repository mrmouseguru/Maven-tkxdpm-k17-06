package api;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nhan2so.InputBoundary;
import nhan2so.InputData;
import nhan2so.Nhan2So;
import nhan2so.Nhan2SoControl;
import presenters.Nhan2SoPresenterAPI;
import presenters.Nhan2SoViewModelAPI;

@Path("/nhan2so") // url
@Consumes(MediaType.APPLICATION_JSON) // nhận dữ liệu json
@Produces(MediaType.APPLICATION_JSON)
public class Nhan2SoRestfulWsApi {

	@POST
	public Response nhan2soAPI(RequestData body) {

		if (body == null || body.num1 == null || body.num2 == null) {
			Nhan2SoViewModelAPI resp = new Nhan2SoViewModelAPI();
			resp.setSuccess(false);
			resp.setMessage("Missing num1 or num2 in request body");
			return Response.status(Response.Status.BAD_REQUEST).entity(resp).build();
		}

		// Create request-scoped ViewModel + Presenter
		Nhan2SoViewModelAPI responseModel = new Nhan2SoViewModelAPI();
		Nhan2SoPresenterAPI presenter = new Nhan2SoPresenterAPI(responseModel);

		Nhan2So nhan2so = new Nhan2So();
		// Call use case
		InputData input = new InputData();
		input.num1 = body.num1;
		input.num2 = body.num2;
		
		InputBoundary in = new Nhan2SoControl(presenter, nhan2so);
		in.execute(input);

		return Response.ok(responseModel).build();

	}

}
