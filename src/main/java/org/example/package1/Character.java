package org.example.package1;

public class Character {

        String cls, name, weapon;
        Character(String cls, String name, String weapon) {
                this.setCls(cls);
                this.setName(name);
                this.setWeapon(weapon);
        }

        public void setName(String name) {
                this.name = name;
        }
        public void setCls(String cls) {
                this.cls = cls;
        }
        public void setWeapon(String weapon) {
                this.weapon = weapon;
        }

        String move1;
        String move2;
        String move3;
        String move4;

        
}
