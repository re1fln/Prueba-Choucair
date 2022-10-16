package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.model.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Load implements Task {

    private  final Map<String, String> testData;

    public Load(Map<String, String> testData) {
        this.testData = testData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<Map.Entry<String, String>> testDataAux = testData.entrySet();
        TestData.setData(testDataAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    public static Performable testData(Map<String, String> testData) {
        return Tasks.instrumented(Load.class,testData);
    }



}
