using BT1_AbstractFactory.Interfaces;
using BT1_AbstractFactory.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BT1_AbstractFactory.Factory
{
    internal class AsianCarFactory : ICarFactory
    {
        public ISedan CreateSedan() => new AsianSedan();
        public ISUV CreateSUV() => new AsianSUV();
        public IElectronic CreateElectronic() => new AsianElectronic();
    }
}
