package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPossitionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver jd;

    SetPossitionCommand(int x, int y, Job2dDriver jd)
    {
        this.x = x;
        this.y = y;
        this.jd = jd;
    }
    @Override
    public void execute() {
        jd.setPosition(x, y);
    }
}
