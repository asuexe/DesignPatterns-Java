package com.EX4;

public class VirtualBox extends VirtualObject {
    
    private float size;
    
    public VirtualBox(float x, float y, float z, float size) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.size = size;
    }
    
    @Override
    public void update() {
        // do nothing for now
    }
    
    @Override
    public float getRadius() {
        return size / 2;
    }
    
    @Override
    public void handleCollision(VirtualObject other) {
        // do nothing for now
    }
    
}
