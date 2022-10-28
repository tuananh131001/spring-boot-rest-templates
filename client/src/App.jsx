import AddForm from './components/AddForm'
import Container from '@mui/material/Container';
import Typography from '@mui/material/Typography'
import ListProduct from './components/ListProduct';
function App() {

  return (
    <div className="App">
      <Container>
        <ListProduct></ListProduct>
        <AddForm></AddForm>
      </Container>
      
    </div>
  )
}

export default App
