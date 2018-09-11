## Android Dagger2 Constructor Injection Using an Interface (Kotlin)

This Android project demonstrates Dagger2 constructor injection of two implementations of the same 
interface using the @Named annotation.

### System Requirements

* Android SDK Version 27 (see Notes)
  
### Development Environment

* Android Studio 3.1
* Emulator: Nexus5X API 22

### Implementation

* Implementation is kept at a minimum for readability.
* The @Named annotation uses string constant arguments

### Testing

* Unit, integration, and functional tests are provided.

#### The Interface

```
interface Greeting {
    fun getData(): String
}
```

#### The Injection

```
class GreetingRepository
    @Inject
    constructor(
            @Named(HELLO) private val hello: Greeting,
            @Named(GOODBYE) private val goodbye: Greeting
    ) {
    
    fun getHello() = hello.getData()
    fun getGoodbye() = goodbye.getData()
}
```

#### The Dagger Module

```
@Module
class GreetingModule {
    @Provides
    @Named(HELLO)
    fun provideHello(): Greeting = Hello(DAGGER_HELLO)
    
    @Provides
    @Named(GOODBYE)
    fun provideGoodbye(): Greeting = Goodbye(DAGGER_GOODBYE)
    
    @Provides
    fun provideGreetingRepository(
            @Named(HELLO) hello: Greeting,
            @Named(GOODBYE) goodbye: Greeting) = GreetingRepository(hello, goodbye)
}
```

### Notes
* Due to a known layout editor bug, the ConstraintLayout does not render with API version 28. 
* Due to a known Gradle bug, three errors are displayed when building. According to the tracker,
these errors are related to kapt and should be warnings instead of errors. The displayed errors 
do not affect building or running the app.
