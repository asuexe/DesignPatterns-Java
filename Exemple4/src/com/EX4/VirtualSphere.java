package com.EX4;

public class VirtualSphere extends VirtualObject {
    
    private float radius;
    
    public VirtualSphere(float x, float y, float z, float radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }
    
    @Override
    public void update() {
        // do nothing for now
    }
    
    @Override
    public float getRadius() {
        return radius;
    }
    
    @Override
    public void handleCollision(VirtualObject other) {
        // do nothing for now
    }
    
}
