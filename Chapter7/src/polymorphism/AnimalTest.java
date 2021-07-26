package polymorphism;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBooks() { System.out.println("사람이 책을 읽습니다."); }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() { System.out.println("호랑이가 사냥을 합니다.") ;}
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
    public void Flying() { System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다."); }
}

public class AnimalTest {
    public static void main(String[] args) {
        // 업캐스팅
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest animalTest = new AnimalTest();
        animalTest.downCastingTest(animalList);

//        for(Animal animal : animalList) {
//            animal.move();
//        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public void downCastingTest(ArrayList<Animal> list) {
        for (Animal animal : list) {
            // 다운캐스팅 오류 예방으로 instanceof 를 사용
            // Eagle human = (Eagle)hAnimal;
            if (animal instanceof Human human) {
                human.readBooks();
            } else if (animal instanceof Tiger tiger) {
                tiger.hunting();
            } else if (animal instanceof Eagle eagle) {
                eagle.Flying();
            } else {
                System.out.println("error");
            }
        }
    }
}
