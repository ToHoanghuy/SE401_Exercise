using BT2_FactoryMethod.Factories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT2_FactoryMethod
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Restaurant restaurant = new Restaurant();

            Console.WriteLine("Đặt món Pizza:");
            restaurant.OrderFood(new PizzaFactory());

            Console.WriteLine("Đặt món Burger:");
            restaurant.OrderFood(new BurgerFactory());

            Console.WriteLine("Đặt món Pasta:");
            restaurant.OrderFood(new PastaFactory());

            Console.ReadKey();
        }
    }
}
