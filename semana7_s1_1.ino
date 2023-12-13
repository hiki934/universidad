nt ledPin = 9;
int buttonPin = 2;

void setup() {
  // Configurar el pin del LED como salida
  pinMode(ledPin, OUTPUT);
  pinMode(buttonPin, INPUT_PULLUP);
}

void loop() {
  // Leer el estado del pulsador
  int buttonState = digitalRead(buttonPin);

  // Si el pulsador se presiona (estado bajo)2
  if (buttonState == LOW) {
    // Encender el LED
    digitalWrite(ledPin, HIGH);
  } else {
    // Apagar el LED
    digitalWrite(ledPin, LOW);
  }
}