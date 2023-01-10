package transport;

public class train extends transport {
    private int costWay;
    private int time;
    private String startPoint;
    private String finishPoint;
    private int railwayCarriage;

    public train(String brand, String model, int year, String country, String color, int maxSpeed, int costWay, int time, String startPoint, String finishPoint, int railwayCarriage) {
        super(brand, model, year, country, color, maxSpeed);
        this.setCostWay(costWay);
        this.setTime(time);
        this.setStartPoint(startPoint);
        this.setFinishPoint(finishPoint);
        this.setRailwayCarriage(railwayCarriage);
    }

    public double getCostWay() {
        return costWay;
    }

    public void setCostWay(int costWay) {
        if (costWay > 0) {
            this.costWay = costWay;
        } else {
            this.costWay = Math.abs(costWay);
        }
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time > 0) {
            this.time = time;
        } else {
            this.time = Math.abs(time);
        }
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        if (startPoint != null && !startPoint.isEmpty() && !startPoint.isBlank()) {
            this.startPoint = startPoint;
        } else {
            this.startPoint = "try again";
        }
    }

    public String getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(String finishPoint) {
        if (finishPoint != null && !finishPoint.isEmpty() && !finishPoint.isBlank()) {
            this.finishPoint = finishPoint;
        } else {
            this.finishPoint = "try again";
        }
    }

    public int getRailwayCarriage() {
        return railwayCarriage;
    }

    public void setRailwayCarriage(int railwayCarriage) {
        if (railwayCarriage > 0) {
            this.railwayCarriage = railwayCarriage;
        } else {
            this.railwayCarriage = Math.abs(railwayCarriage);
        }
    }
}
