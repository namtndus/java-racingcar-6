package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.constant.Constant.DISTANCE_DRIVER;

public class RacingCar extends Car {

    public RacingCar(String name) {
        super(name);
    }

    @Override
    public void moveCar(int number) {
        if(number >= 4)
            distanceDriver += DISTANCE_DRIVER;
    }
}
