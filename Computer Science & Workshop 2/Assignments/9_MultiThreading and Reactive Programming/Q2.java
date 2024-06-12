// Q2. Write a Java program that uses reactive programming to read a file asynchronously. Use RxJavaoranother reactive library to handle the file reading and processing.

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReactiveFileReader {
    public static void main(String[] args) {
        String filePath = "example.txt";
        Observable<String> fileObservable = Observable.create(emitter -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    emitter.onNext(line);
                }
                emitter.onComplete();
            } catch (IOException e) {
                emitter.onError(e);
            }
        });
        fileObservable
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.computation())
                .subscribe(
                        line -> System.out.println("Line: " + line), Throwable::printStackTrace,
                        () -> System.out.println("File reading completed"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Output:- Line: Hello World
// Line: This is a test
// Line: File reading example
// File reading completed