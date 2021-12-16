package factories;

import shapes.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType) ;
}
