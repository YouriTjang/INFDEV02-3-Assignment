package factory;

import container.IContainer;
import factory.IFactory;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import truck.ITruck;

import java.util.List;

public class IkeaFactory implements IFactory {
    public IkeaFactory(Point2D point2D, Dimension2D dimension2D, Point2D point2D1, Point2D point2D2, Image ikea, Image productContainer, Image productBox, Image volvo) {
    }

    @Override
    public ITruck getReadyTruck() {
        return null;
    }

    @Override
    public Point2D getPosition() {
        return null;
    }

    @Override
    public List<IContainer> getProductsToShip() {
        return null;
    }

    @Override
    public void draw(GraphicsContext gc) {

    }

    @Override
    public void update(float dt) {

    }
}
