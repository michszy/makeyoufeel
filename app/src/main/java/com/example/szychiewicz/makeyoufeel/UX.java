package com.example.szychiewicz.makeyoufeel;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UX implements Serializable {

        public Emoji emoji;

        public char direction;

        public UX() {
        }

        public Emoji getEmoji() {
            return emoji;
        }

        public void setEmoji(Emoji emoji) {
            this.emoji = emoji;
        }

        public char getDirection() {
            return direction;
        }

        public void setDirection(char direction) {
            this.direction = direction;
        }

}
