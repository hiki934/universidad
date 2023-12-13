#include <Servo.h>

int trigger = 2;
int echo = 3;
int led1 = 8;
int led2 = 9;
Servo servo;

long distance = 0;

void setup() {
  pinMode(trigger, OUTPUT);
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(echo, INPUT);
  servo.attach(10);

  Serial.begin(9600);
}

void loop() {
  // Logic of sensor HC-SR04
  digitalWrite(trigger, 1);
  delayMicroseconds(10);
  digitalWrite(trigger, 0);
  distance = pulseIn(echo, 1) * 0.017;

  // Report distance in the serial monitor
  Serial.print(distance);
  Serial.println("cm");
  delay(100);

  // Led1 logic
  if(distance > 10) {
    digitalWrite(led1, 1);
    digitalWrite(led2, 0);
    servo.write(180);
  } else {
    digitalWrite(led1, 0);
    digitalWrite(led2, 1);
    servo.write(0);
  }
}