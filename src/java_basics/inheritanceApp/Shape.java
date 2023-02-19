package java_basics.inheritanceApp;

  public class Shape{
    
        private  int color;
        private float area;
        //sha
        public void sayName(){
            System.out.println("I'm a super class 'Shape'");
        }
        public float getArea(){
            return this.area;
        }
        public void setArea(float area){
            this.area = area;
        }
        public int getColor(){
            return color;
        };
        public void setColor(int c){
            this.color = c;

        };


    }


    
