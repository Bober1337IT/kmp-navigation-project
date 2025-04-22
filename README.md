# Kotlin Multiplatform Argument Navigation Example 🚀

To jest przykład aplikacji stworzonej w Kotlin Multiplatform z użyciem **Jetpack Compose** oraz **Navigation Compose**, która pokazuje, jak przekazywać argumenty pomiędzy ekranami.

##  Funkcje

- Dwa ekrany: `InputScreen` i `OutputScreen`
- Przekazywanie argumentu `name` pomiędzy ekranami
- Obsługa pustego pola (domyślna wartość "John Doe")

##  Podgląd UI

###  InputScreen

Użytkownik może wpisać swoje imię w polu tekstowym i kliknąć "Submit", aby przejść do następnego ekranu.

###  OutputScreen

Ekran wyświetla powitanie z podanym imieniem oraz przycisk "Go Back!", który pozwala wrócić na poprzedni ekran.

### Gradle

libs.versions.toml - > navigationComposeVersion = "2.8.0-alpha10" ,  navigation-compose = { module = "org.jetbrains.androidx.navigation:navigation-compose", version.ref = "navigationComposeVersion" }

build.gradle.kts -> commonMain.dependencies -> implementation(libs.navigation.compose)
