package example;


import example.modelcrew.FlightVO;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;


@Component("kinesisFunction")
public class TheFunction implements Consumer<FlightVO>{

    @Override
    public void accept(FlightVO flightVO) {
        System.out.println("Recieved!");
        System.out.println(flightVO);
    }
}
