package com.malanak.hackmod.client.gui;

import com.malanak.hackmod.HackMod;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.option.NarratorMode;
import net.minecraft.text.Text;

public class HackMenu extends Screen {

    public HackMenu(Text title) {
        super(title);
    }
    Text getFlyingMessage() {
        if (HackMod.FlyingToggled) {
            return Text.of("Flying: on");
        } else {
            return Text.of("Flying: off");
        }
    }
    public void init() {
        this.addDrawableChild(ButtonWidget.builder(getFlyingMessage(), button -> {
            HackMod.FlyingToggled = !HackMod.FlyingToggled;
            button.setMessage(getFlyingMessage());
        })
                .dimensions(this.width / 2 - 100, this.height / 6 + 24, 200, 20)
                .build());/*, NarratorMode.CHAT));*/
    }
}
