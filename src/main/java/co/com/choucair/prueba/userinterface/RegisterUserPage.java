package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUserPage extends PageObject {

    //BOTON DE Sign in
    public static final Target BUTTON_SING_IN = Target.the("Boton de ingreso a el registro del usuario").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
    //Email
    public static final Target INGRESAR_EMAIL = Target.the("Ingresar email").located(By.id("email_create"));
    //Boton de ingreso al formulario
    public static final Target BUTTON_FORMULARY = Target.the("Boton para ingresar al formulario").located(By.id("SubmitCreate"));
    //Ingresar el title Mr
    public static final Target INGRESAR_TITLE_MR = Target.the("Seleccionar señor").located(By.id("id_gender1"));
    //Ingresar el title Mrs
    public static final Target INGRESAR_TITLE_MRS = Target.the("Selecccionar señora").located(By.id("id_gender2"));
    //Ingresar nombre
    public static final Target INGRESAR_FIRST_NAME = Target.the("Ingresar el nombre").located(By.id("customer_firstname"));
    //Ingresar apellido
    public static final Target INGRESAR_LAST_NAME = Target.the("Ingresar apellido").located(By.id("customer_lastname"));
    //Ingresar contraseña
    public static final Target INGRESAR_PASSWORD = Target.the("Ingresar contraseña").located(By.id("passwd"));
    //ingresar dia de nacimiento
    public static final Target INGRESAR_BIRTH_DAY = Target.the("Ingresar dia de nacimiento").located(By.id("days"));
    //Ingresar mes de nacimiento
    public static final Target INGRESAR_BIRTH_MONTH = Target.the("Ingresar mes de nacimiento").located(By.id("months"));
    //Ingresar año de nacimiento
    public static final Target INGRESAR_BIRTH_YEAR = Target.the("Ingresar año de nacimiento").located(By.id("years"));
    //Ingresar la compañia company
    public static final Target INGRESAR_COMPANY = Target.the("Ingresar compañia").located(By.id("company"));
    //ingresar direcion
    public static final Target INGRESAR_ADDRESS1 = Target.the("Ingresar direccion 1").located(By.id("address1"));
    //ingresar direcion 2
    public static final Target INGRESAR_ADDRESS2 = Target.the("Ingresar direccion 2").located(By.id("address2"));
    //Ingresar ciudad
    public static final Target INGRESAR_CITY = Target.the("Ingresar ciudad").located(By.id("city"));
    //ingresar state
    public static final Target INGRESAR_STATE = Target.the("Ingresar estado").located(By.id("id_state"));
    //Ingresar codigo postal
    public static final Target INGRESAR_POSTCODE = Target.the("Ingresar codigo postal").located(By.id("postcode"));
    //Ingresar pais
    public static final Target INGRESAR_COUNTRY = Target.the("Ingresar pais").located(By.id("id_country"));
    //Ingresar informacion
    public static final Target INGRESAR_INFORMATION = Target.the("Ingresar informacion").located(By.id("other"));
    //Ingresar telefono
    public static final Target INGRESAR_PHONE = Target.the("Ingresar telefono").located(By.id("phone"));
    //Ingresar movil
    public static final Target INGRESAR_MOVIL_PHONE = Target.the("Ingresar movil").located(By.id("phone_mobile"));
    //Ingresar alias
    public static final Target INGRESAR_ALIAS = Target.the("Ingresar alias").located(By.id("alias"));
    // boton de register
    public static final Target BUTTON_RESGISTER = Target.the("Boton para guardar el registro").located(By.id("submitAccount"));
    // Texto de verificacion
    public static final Target VERIFICATION_NOMBRE = Target.the("Verificacion de usuario por nombre").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));


}
