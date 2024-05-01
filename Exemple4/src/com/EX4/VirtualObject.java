package com.EX4;

public abstract class VirtualObject {
    
    protected float x;
    protected float y;
    protected float z;
    
    public abstract void update();
    
    public boolean collidesWith(VirtualObject other) {
        float dx = this.x - other.x;
        float dy = this.y - other.y;
        float dz = this.z - other.z;
        float distanceSquared = dx*dx + dy*dy + dz*dz;
        float radiusSum = this.getRadius() + other.getRadius();
        return distanceSquared <= radiusSum*radiusSum;
    }
    
    public abstract float getRadius();
    
    public abstract void handleCollision(VirtualObject other);
    
}
