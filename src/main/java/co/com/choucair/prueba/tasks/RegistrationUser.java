package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.model.TestData;
import co.com.choucair.prueba.userinterface.RegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

public class RegistrationUser implements Task {


    public static Performable testData() {
        return Tasks.instrumented(RegistrationUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Espera al boton
                WaitUntil.the(RegisterUserPage.BUTTON_SING_IN, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                //Click al boton
                Click.on(RegisterUserPage.BUTTON_SING_IN),
                //Ingresar email
                Enter.theValue(TestData.getData().get("correo").toString()).into(RegisterUserPage.INGRESAR_EMAIL),
                //Click al boton
                Click.on(RegisterUserPage.BUTTON_FORMULARY)
        );

        if (TestData.getData().get("title").toString() == "1" ){
            actor.attemptsTo(
                    // infresar MS
                    Click.on(RegisterUserPage.INGRESAR_TITLE_MR)
            );
        }else {
            actor.attemptsTo(
                    // infresar MS
                    Click.on(RegisterUserPage.INGRESAR_TITLE_MRS)
                    );
        }

        actor.attemptsTo(

                //Enter.theValue(TestData.getData().get("").toString()).into(RegisterUserPage),


                //Ingresar nombre
                Enter.theValue(TestData.getData().get("nombre").toString()).into(RegisterUserPage.INGRESAR_FIRST_NAME),
                //Ingresar apellido
                Enter.theValue(TestData.getData().get("apellido").toString()).into(RegisterUserPage.INGRESAR_LAST_NAME),
                //Ingresar contraseña
                Enter.theValue(TestData.getData().get("password").toString()).into(RegisterUserPage.INGRESAR_PASSWORD),
                //ingresar dia de nacimiento
                SelectFromOptions.byValue(TestData.getData().get("birthDay").toString()).from(RegisterUserPage.INGRESAR_BIRTH_DAY),
                //Ingresar mes de nacimiento
                SelectFromOptions.byValue(TestData.getData().get("birthMes").toString()).from(RegisterUserPage.INGRESAR_BIRTH_MONTH),
                //Ingresar año de nacimiento
                SelectFromOptions.byValue(TestData.getData().get("birthyear").toString()).from(RegisterUserPage.INGRESAR_BIRTH_YEAR),
                //Ingresar la compañia company
                Enter.theValue(TestData.getData().get("company").toString()).into(RegisterUserPage.INGRESAR_COMPANY),
                //ingresar direcion
                Enter.theValue(TestData.getData().get("address").toString()).into(RegisterUserPage.INGRESAR_ADDRESS1),
                //ingresar direcion 2
                Enter.theValue(TestData.getData().get("address2").toString()).into(RegisterUserPage.INGRESAR_ADDRESS2),
                //Ingresar ciudad
                Enter.theValue(TestData.getData().get("city").toString()).into(RegisterUserPage.INGRESAR_CITY),
                //ingresar state
                SelectFromOptions.byValue(TestData.getData().get("state").toString()).from(RegisterUserPage.INGRESAR_STATE),
                //Ingresar codigo postal
                Enter.theValue(TestData.getData().get("codPostal").toString()).into(RegisterUserPage.INGRESAR_POSTCODE),
                //Ingresar pais
                SelectFromOptions.byValue(TestData.getData().get("country").toString()).from(RegisterUserPage.INGRESAR_COUNTRY),
                //Ingresar informacion
                Enter.theValue(TestData.getData().get("information").toString()).into(RegisterUserPage.INGRESAR_INFORMATION),
                //Ingresar telefono
                Enter.theValue(TestData.getData().get("homePhone").toString()).into(RegisterUserPage.INGRESAR_PHONE),
                //Ingresar movil
                Enter.theValue(TestData.getData().get("movilPhone").toString()).into(RegisterUserPage.INGRESAR_MOVIL_PHONE),
                //Ingresar alias
                Enter.theValue(TestData.getData().get("alias").toString()).into(RegisterUserPage.INGRESAR_ALIAS),
                // boton de register
                Click.on(RegisterUserPage.BUTTON_RESGISTER),
                // TIEMPO DE ESPERA DE VERIFICACION
                WaitUntil.the(RegisterUserPage.VERIFICATION_NOMBRE, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()


                );











    }


}
