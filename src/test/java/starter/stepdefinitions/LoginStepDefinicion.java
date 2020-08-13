package starter.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

public class LoginStepDefinicion {

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	private String actor;

	@Given("^(.*) wants make login into the aplication")
	public void a_user_wants_make_login_into_the_aplication(String actor) {
		this.actor = actor;
	}

	@When("he send valid credentials")
	public void he_send_valid_credentials() {

		theActorCalled(actor).attemptsTo(DoLogin.withCredentials("hola", "12345tt"));
	}

	@Then("he should to acces to the application")
	public void he_should_to_acces_to_the_application() {

	}

	@Given("^(?:.*) wants make login into the aplication with invalid credentials")
	public void william_wants_make_login_into_the_aplication_with_invalid_credentials() {

	}

	@When("he send invalid credentials")
	public void he_send_invalid_credentials() {

	}

	@Then("he should not to acces to the application")
	public void he_should_not_to_acces_to_the_application() {

	}

}
