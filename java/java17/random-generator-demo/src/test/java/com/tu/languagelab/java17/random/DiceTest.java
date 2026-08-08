package com.tu.languagelab.java17.random;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Random;
import org.junit.jupiter.api.Test;
class DiceTest { @Test void staysInDiceRange() { int value = Dice.roll(new Random(1)); assertTrue(value >= 1 && value <= 6); } }
