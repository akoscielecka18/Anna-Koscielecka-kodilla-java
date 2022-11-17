    package com.kodilla.testing.shape;

    import java.util.ArrayList;

    public class ShapeCollector {

        private ArrayList<Shape> shapeList = new ArrayList<>();
        public void addFigure(Shape shape){
            shapeList.add(shape);
        }

        public void removeFigure(Shape shape){
            shapeList.remove(shape);
        }
        public Shape getFigure(int n){
            return this.shapeList.get(n);
        }

        public ArrayList<Shape> showFigures() {
            return this.shapeList;
        }
    }

