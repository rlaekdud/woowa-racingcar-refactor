package racingcar.model;

public class RacingCar {
    private String name;
    private Integer distance;

    public RacingCar(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void advance() {
        Integer currDistance = getDistance();
        setDistance(currDistance++);
    }

    // getter, setter
    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }

    private void setDistance(Integer distance) { // 내부적으로 사용, 외부에서는 바꾸지 못하게 하기 위해 private로 설정
        this.distance = distance;
    }
}
