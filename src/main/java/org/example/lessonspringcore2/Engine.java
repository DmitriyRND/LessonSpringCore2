package org.example.lessonspringcore2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class Engine {

        private int id;
        private int power;

        public Engine(int id, int power) {
            this.id = id;
            this.power = power;
        }
}
