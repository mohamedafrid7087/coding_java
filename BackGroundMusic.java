package afridcorp.abstractclass;


abstract class ThemeMusic {
    abstract void play();
}

class Rahman extends ThemeMusic {
    @Override
    void play() {
        System.out.println("theme music by Ar Rahman");
    }
}

    class Aniruth extends ThemeMusic {
        @Override
        void play() {
            System.out.println("theme music by aniruth");
        }
    }


    class BackGroundMusic {
        public static void main(String[] args) {
            ThemeMusic obj1 = new Rahman();
            obj1.play();
            Aniruth obj2 = new Aniruth();
            obj2.play();
        }
    }



