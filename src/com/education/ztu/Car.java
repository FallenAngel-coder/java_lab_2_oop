package com.education.ztu;

public class Car {
    private String brand;
    private Engine engine;
    private int mileage;

    {
        brand = "Невідома марка";
        engine = new Engine();
        mileage = 0;
    }

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean engineIsRunning() {
        return engine.isEngineWorks();
    }

    public void drive(int kilometers) {
        mileage += kilometers;
    }

    public class Engine {
        private boolean engineWorks;

        {
            engineWorks = false;
        }

        public Engine() {
        }

        public Engine(boolean engineWorks) {
            this.engineWorks = engineWorks;
        }

        public void startEngine() {
            engineWorks = true;
        }

        public void stopEngine() {
            engineWorks = false;
        }

        public boolean isEngineWorks() {
            return engineWorks;
        }
    }
}
