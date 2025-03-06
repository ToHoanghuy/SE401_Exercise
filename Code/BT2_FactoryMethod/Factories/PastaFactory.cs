using BT2_FactoryMethod.FoodItems;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT2_FactoryMethod.Factories
{
    public class PastaFactory : IFoodFactory
    {
        public IFoodItem CreateFood()
        {
            return new Pasta();
        }
    }
}
