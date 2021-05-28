package com.avi.java11;

import java.util.*;
interface CanSwim {}
class Amphibian implements CanSwim {}
abstract class Tadpole extends Amphibian {}
class FindAllTodpole {
    public static void main(String[] args) {
        var tadpoles = new ArrayList<Tadpole>();
        //TodPole -> Amphibian -> CanSwim -> Object
        for (Amphibian amphibian : tadpoles) {
            CanSwim tadpole = amphibian;
        } } }
