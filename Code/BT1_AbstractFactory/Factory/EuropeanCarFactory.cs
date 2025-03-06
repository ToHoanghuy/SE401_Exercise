using BT1_AbstractFactory.Interfaces;
using BT1_AbstractFactory.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Factory
{
    internal class EuropeanCarFactory : ICarFactory
    {
        public ISedan CreateSedan() => new EuropeanSedan();
        public ISUV CreateSUV() => new EuropeanSUV();
        public IElectronic CreateElectronic() => new EuropeanElectronic();
    }
}
