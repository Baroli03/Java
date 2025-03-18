plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Dependência para o Gson
    implementation("com.google.code.gson:gson:2.10.1")

    // Dependência para o Jackson
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")

    // Dependência para o JUnit (caso tenha intenção de rodar testes)
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Dependência para o Guava (já presente)
    implementation("com.google.guava:guava:30.1-jre")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Corrigido o erro: use `mainClass.set(...)` corretamente
    mainClass.set("meuPacote.GravadorJson")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
