using BT1_AbstractFactory.Factory;
using BT1_AbstractFactory.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ICarFactory europeanFactory = new EuropeanCarFactory();
            DisplayCarDetails("European", europeanFactory);

            ICarFactory asianFactory = new AsianCarFactory();
            DisplayCarDetails("Asian", asianFactory);

            Console.ReadLine();
        }

        static void DisplayCarDetails(string region, ICarFactory factory)
        {
            ISedan sedan = factory.CreateSedan();
            ISUV suv = factory.CreateSUV();
            IElectronic electronic = factory.CreateElectronic();

            Console.WriteLine($"{region} Sedan: Engine={sedan.GetEngine()}, Seat={sedan.GetSeat()}, Size={sedan.GetSize()}");
            Console.WriteLine($"{region} SUV: Engine={suv.GetEngine()}, Seat={suv.GetSeat()}, Size={suv.GetSize()}");
            Console.WriteLine($"{region} Electric: Engine={electronic.GetEngine()}, Seat={electronic.GetSeat()}, Size={electronic.GetSize()}");
            Console.WriteLine();
        }
    }
}
