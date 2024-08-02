public class AnimalFactory {
    public Animal getAnimal(String Type) {
        if("canine".equals(Type)) {
            return new Dog();
        }else{
            return new Cat();
        }
    }
}
