package com.EX4;

import java.util.ArrayList;
import java.util.List;

public class VirtualWorld {
    
    private List<VirtualObject> objects = new ArrayList<>();
    
    public void addObject(VirtualObject object) {
        objects.add(object);
    }
    
    public void removeObject(VirtualObject object) {
        objects.remove(object);
    }
    
    public void update() {
        for (VirtualObject object : objects) {
            object.update();
        }
        checkCollisions();
    }
    
    private void checkCollisions() {
        for (int i = 0; i < objects.size(); i++) {
            VirtualObject object1 = objects.get(i);
            for (int j = i + 1; j < objects.size(); j++) {
                VirtualObject object2 = objects.get(j);
                if (object1.collidesWith(object2)) {
                    object1.handleCollision(object2);
                    object2.handleCollision(object1);
                }
            }
        }
    }
    
}






