package abstraction.lesson4;

public interface Speakable {
    void speak(); // nói chuyện

    void whisper(); // nói thì thầm
}

class Speaking {
    private Speakable mSpeakable;

    public Speaking(Speakable speakable) {
        mSpeakable = speakable;
    }

    public void doSpeak() {
        System.out.println("Inside class Speaking...");
        mSpeakable.speak();
        mSpeakable.whisper();
    }
}

class SpeakableExample {
    public static void main(String[] args) {
        // tạo đối tượng của lớp với tham số là lớp vô danh
        Speaking speaking = new Speaking(new Speakable() {
            @Override
            public void speak() {
                System.out.println("Bla bla...");
            }

            @Override
            public void whisper() {
                System.out.println("Suỵt...");
            }
        });

        speaking.doSpeak();
    }
}