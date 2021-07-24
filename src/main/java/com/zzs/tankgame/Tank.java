package com.zzs.tankgame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：zzs
 * @version : 1.0
 * @date ：Created in 2021/7/24 15:16
 * @description：公共坦克坐标
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tank {
    private int x;
    private int y;
    private int direction; //方向
    private int moveNum; // 移动单位
    private int type; // 类型

    public void moveUp() {
        this.y -= moveNum;
    }

    public void moveRight() {
        this.x += moveNum;
    }

    public void moveDown() {
        this.y += moveNum;
    }

    public void moveLeft() {
        this.x -= moveNum;
    }



}