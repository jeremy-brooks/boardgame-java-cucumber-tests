import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by jbrooks on 29/09/2015.
 */
public class NewGameStepDefs {
    @Given("^that a new game board is created with (\\d+) player$")
    public void that_a_new_game_board_is_created_with_player(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^the player starts at square (\\d+),(\\d+)$")
    public void the_player_starts_at_square_(int arg1, int arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^the player moves up (\\d+) square$")
    public void the_player_moves_up_square(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^the players position is: x = (\\d+), y = (\\d+)$")
    public void the_players_position_is_x_y_(int arg1, int arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^the player moves right (\\d+) square$")
    public void the_player_moves_right_square(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
