package factory;

import container.IContainer;
import factory.IFactory;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import truck.ITruck;

import java.util.List;

public class MiningFactory implements IFactory {
    Point2D factoryPosition;
    Dimension2D imageDimension2D;

    //factoryPosition, imagedimensions, truckStartPosition, truckVelocity, images X 4
    public MiningFactory(Point2D factoryPosition, Dimension2D imageDimension2D, Point2D point2D1, Point2D point2D2, Image mine, Image oreContainer, Image mineCart, Image volvo) {
        this.factoryPosition = factoryPosition;
        this.imageDimension2D = imageDimension2D;
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
        Image mine = new Image("mine.png");
        gc.drawImage(mine, factoryPosition.getX(), factoryPosition.getY(), imageDimension2D.getWidth(), imageDimension2D.getHeight());
    }

    @Override
    public void update(float dt) {

    }
}
