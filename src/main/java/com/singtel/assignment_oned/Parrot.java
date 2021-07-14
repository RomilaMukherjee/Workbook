package com.singtel.assignment_oned;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Parrot {

    private SoundType soundType;

    public String makeDifferentSound(){
        return soundType.sound();
    }
}
