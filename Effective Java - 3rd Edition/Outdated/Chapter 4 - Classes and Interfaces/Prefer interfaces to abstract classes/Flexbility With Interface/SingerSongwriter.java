public interface SingerSongwriter extends Singer, Songwriter {
    AudioClip strum();
    void actSensitive();
}

// In real life, some singers are also songwriters. Because we used interfaces
//rather than abstract classes to define these types, it is perfectly permissible for a
//single class to implement both Singer and Songwriter. In fact, we can
//define a third interface that extends both Singer and Songwriter and adds
//new methods that are appropriate to the combination: