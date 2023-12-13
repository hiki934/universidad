int trigger = 2;
int echo = 3;

long distance = 0;

void setup() {
    pinMode(trigger, OUTPUT);
    pinMode(echo, INPUT);
    Serial.begin(9600);
}

void loop() {

    digitalWrite(trigger, 1);
    delayMicroseconds(10);
    digitalWrite(trigger, 0);
  distance = pulseIn(echo, 1) * 0.017;


    Serial.print(distance);
    Serial.println("cm");
    delay(100);
}