package example;


import org.springframework.stereotype.Component;

import java.util.function.Consumer;


@Component("kinesisFunction")
public class TheFunction implements Consumer<ObjectToProduce>{

    @Override
    public void accept(ObjectToProduce objectToConsume) {
        System.out.println("Recieved!");
        System.out.println(objectToConsume);
    }
}
