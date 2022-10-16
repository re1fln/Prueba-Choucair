package co.com.choucair.prueba.questions;

import co.com.choucair.prueba.model.TestData;
import co.com.choucair.prueba.userinterface.RegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Check_record_register implements Question<Boolean> {


    public static Check_record_register toThe() {
        return new Check_record_register();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(RegisterUserPage.VERIFICATION_NOMBRE).viewedBy(actor).asString();
        if (TestData.getData().get("nombre_verificacion").toString().equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }


}
