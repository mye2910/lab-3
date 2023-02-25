/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;

/**
 *
 * @author Asus
 */
public class Vector {

    
    public static void main(String[] args) {
      
        private final double x;
        private final double y;
        private final double z;
    
        
        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    
        
        public double getX() {
            return x;
        }
    
       
        public double getY() {
            return y;
        }
    
        
        public double getZ() {
            return z;
        }
    
       
        public Vector cong(Vector v) {
            return new Vector(x + v.getX(), y + v.getY(), z + v.getZ());
        }
    
       
        public Vector tru(Vector v) {
            return new Vector(x - v.getX(), y - v.getY(), z - v.getZ());
        }
    
        
        public Vector nhan(double k) {
            return new Vector(k * x, k * y, k * z);
        }
    
       
        public double nhanVH(Vector v) {
            return x * v.getX() + y * v.getY() + z * v.getZ();
        }
    }
    
    

    
    

