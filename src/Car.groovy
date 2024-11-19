class POO {

        String name;
        String color;
        int model;

        def getCarDetail(){
            println("You are driving $model, $color, $name")
        };

    static void main(args){
        Car toyota=new Car()
        Car ford=new Car()

        toyota.name="Toyota"
        toyota.color="Black"
        toyota.model=2024

        ford.name="Ford"
        ford.color="Black"
        ford.model=2024

        toyota.getCarDetail()
        ford.getCarDetail()

    }


}
