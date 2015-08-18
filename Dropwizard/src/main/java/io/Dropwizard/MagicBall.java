package io.Dropwizard;


public class MagicBall {

        private String color;
        private String size;
        private String shape;


        public void setColor(String color)
        {
            this.color = color;
        }

            public String getColor()
            {
                return color;
            }

            public float getColorValue()
            {
                int value=0;
                switch (color) {
                    case "Red":
                        value = 1;
                        break;
                    case "Green":
                        value = 2;
                        break;
                    case "Blue":
                        value = 3;
                        break;
                }

                return value;

            }

            public void setSize(String size)
            {
                this.size = size;
            }

            public String getSize()
            {
                return size;
            }

            public float getSizeValue()
            {
                int value = Integer.parseInt(size);
                return value;
            }


            public void setShape(String shape)
            {
                this.shape = shape;
            }

            public String getShape()
            {
                return shape;
            }

            public float getShapeValue()
            {
                int value=0;
                switch (shape) {
                    case "circle":
                        value = 10;
                        break;
                    case "square":
                        value = 30;
                        break;
                    case "triangle":
                        value = 50;
                        break;
                }

                return value;

            }
}
